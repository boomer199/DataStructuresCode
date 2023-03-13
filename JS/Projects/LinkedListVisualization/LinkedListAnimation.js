let preList=[2, 54, "hi", 3, 3234.21, "23"]
let linkedList = new MyLinkedList()
let textArea = document.getElementById("container")
let searchResults = document.getElementById("search-results")


let nodeValue = document.getElementById("nodeValue");
let nodeIndex = document.getElementById("nodeIndex");

let genBttn = document.getElementById("genBttn")
let insertBttn = document.getElementById("insert")
let startBttn = document.getElementById('addStart')
let endBttn = document.getElementById('addLast')
let searchBttn = document.getElementById('search')
let removeBttn = document.getElementById("remove")


genBttn.addEventListener("click", e => {
    for(let i = 0; i < preList.length; i++){
        linkedList.addLast(preList[i])
    }
    textArea.innerHTML = linkedList.toString();

})

insertBttn.addEventListener("click", e => {
    linkedList.insertAt(nodeValue.value, linkedList.getNodeFromIndex(nodeIndex.value))
    textArea.innerHTML = linkedList.toString();
})

startBttn.addEventListener("click", e => {
    linkedList.addFirst(nodeValue.value)
    textArea.innerHTML = linkedList.toString();
})


endBttn.addEventListener("click", e => {
    linkedList.addLast(nodeValue.value)
    textArea.innerHTML = linkedList.toString();
})

searchBttn.addEventListener("click", e => {
    linkedList.search(nodeValue.value)
    if(linkedList.search(nodeValue.value) == true){
        searchResults.innerHTML = nodeValue.value + " was found in the LinkedList!"
    } else {
        searchResults.innerHTML = nodeValue.value + " was not found in the LinkedList!"
    }
})

removeBttn.addEventListener("click", e => {
    if(nodeIndex.value == 0){
        linkedList.removeFirst()
    } else {
        linkedList.removesfrom(nodeIndex.value)
    }
    textArea.innerHTML = linkedList.toString();
})