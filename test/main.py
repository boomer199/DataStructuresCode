import requests
import json

responses = []

def write_json(new_data, filename='data.json'):
    with open(filename,'r+') as file:
          # First we load existing data into a dict.
        file_data = json.load(file)
        # Join new_data with file_data inside emp_details
        file_data["learningData"].append(new_data)
        # Sets file's current position at offset.
        file.seek(0)
        # convert back to json.
        json.dump(file_data, file, indent = 4)

def convert_ms(ms):
  min = ms//60000
  ms -= min*60000
  sec = ms/1000
  if min:
    return "{}:{}".format(min, sec)
  else:
    return str(sec)

def print_event_info(rank):
  if rank["EventType"] == 'T':
    print("-"*30+"\n{},".format(rank['Event']), "Time: {}".format(convert_ms(rank["SortInt"])))
  else:
    print("-"*30+"\n{}".format(rank['Event']))

def get_id(name, school=None):
  response = requests.get("https://www.athletic.net/api/v1/AutoComplete/search?q={}&fq=".format(name.lower().replace(' ', '+'))).json()['response']['docs']
  if len(response) < 1:
    return None
  for person in response:
    if school and school.lower() in person['subtext'].lower():
      id = person['id_db']
      return id
  id = response[0]['id_db']
  return id


name = input("Name of athlete: ")
if name == "t":
  name = "Everett Villiger"
  school = "Head-Royce"
  year = "2023"
else:
  school = input("Name of school: ")
  year = input("Year of results: ")

# TODO: Make a year slider!?!?!?
id = get_id(name, school=school)
response = requests.get(' https://www.athletic.net/api/v1/General/GetRankings?athleteId={}&sport=TF&seasonId={}&truncate=false'.format(id, year)).json()
responses.append(response);

if len(response) < 1:
  raise Exception("No data")


last_event = response[0]["Event"]

# TODO: Make system to remove dupes in data.json

contains = []
for rank in response:  
  print(contains)
  if rank['Event'] == "800 Meters" and contains.__contains__("800 Meters") == False:
    newData = {"name: ": name.lower(), "school: ": school, "year: ": year, "event: ": rank['Event'], "time: ": convert_ms(rank["SortInt"])}
    write_json(newData, "data.json")
    contains.append(rank["Event"])
  if rank['Event'] == "1600 Meters" and contains.__contains__("1600 Meters") == False:
    newData = {"name: ": name.lower(), "school: ": school, "year: ": year, "event: ": rank['Event'], "time: ": convert_ms(rank["SortInt"])}
    write_json(newData, "data.json")
    contains.append(rank["Event"])
  if rank['Event'] == "3200 Meters" and contains.__contains__("3200 Meters") == False:
    newData = {"name: ": name.lower(), "school: ": school, "year: ": year, "event: ": rank['Event'], "time: ": convert_ms(rank["SortInt"])}
    write_json(newData, "data.json")
    contains.append(rank["Event"])
 

