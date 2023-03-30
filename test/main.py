import requests

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
school = input("Name of school: ")

# TODO: Make a year slider!?!?!?
id = get_id(name, school=school)
response = requests.get(' https://www.athletic.net/api/v1/General/GetRankings?athleteId={}&sport=TF&seasonId=2023&truncate=false'.format(id)).json()

if len(response) < 1:
  raise Exception("No data")


last_event = response[0]["Event"]

print_event_info(response[0])
for rank in response:
    if last_event != rank['Event']:
      print_event_info(rank)
      last_event = rank["Event"]
    print("Ranked {} in {}".format(rank['Position'], rank["DivName"]))
