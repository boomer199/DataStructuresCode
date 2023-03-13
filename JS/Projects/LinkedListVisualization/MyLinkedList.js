class MyLinkedList{
    size = 0; 

    constructor(array = []){
        this.head = null; 
        this.tail = this.head;
        for(let i = 0; i < array.length; i++){
            this.addLast(array[i])
        }
    }

    addFirst(num){
        let node = new Node(num)
        if(this.isEmpty()){
            this.head = this.tail = noarde;
        } else {
            node.next = this.head; 
            this.head = node; 
        }
        this.size++;
    }

    addLast(num){
        let node = new Node(num)
        if(this.isEmpty()){
            this.head = node;
            this.tail = this.head; 
        } else {
            this.tail.next = node; 
            this.tail = node; 
        }
        this.size++; 
    }

    getFirst(){
        if(this.isEmpty()){
            return null;
        }
        return this.head.data; 
    }

    getLast(){
        if(this.isEmpty()){
            return null;
        }
        return this.tail.data; 
    }

    removeFirst(){
        if(this.isEmpty()){
            return null;
        }
        this.head = this.head.next;
        this.size--;

        return this.head.data; 
    }

    removeLast(){
        if(this.isEmpty()){
            return null;
        }
        let temp = this.tail;
        if(this.size ==1 ){
            head = tail = null; 
        } else {
            let current = this.head; 
            for (let i = 0; i < this.size - 2; i++) {
                current = current.next;
            }
            this.tail = current;
            current.next = null;
        }
        this.size--;
        return temp.element;

    }

    isEmpty(){
        return this.size == 0; 
    }

    contains(i){
        let current = this.head; 
        for (let j = 0; j < this.size; j++) {
            if(current.data == i){
                return true;
            }
            current = current.next;
        }
        return false; 
    }

    reverse(){
        let r = []; 
        let current = this.head; 
        for (let j = 0; j < this.size; j++) {
            r.push(current.data)
            current = current.next;

        }
        r.reverse()
        return r; 
    }

    printList(){
        let r = []; 
        let current = this.head; 
        for (let j = 0; j < this.size; j++) {
            r.push(current.data)
            current = current.next;

        }
        console.log(r)
    }

    getNodeFromIndex(i){
        let current = this.head; 
        for (let j = 0; j < this.size; j++) {
            if(i == j){
                return current;
            }
            current = current.next;
        }
    }

    

    insertAt(element, prevNode){
        if (prevNode == null)
        {
            console.log("The given previous node cannot be null");
            return;
        }
  
        /* 2 & 3: Allocate the Node &
                  Put in the data*/
        let node = new Node();
        node.data = element
  
        /* 4. Make next of new Node as next of prev_node */
        node.next = prevNode.next;
  
        /* 5. make next of prev_node as new_node */
        prevNode.next = node;
        this.size++;
    }

    removesfrom(index){
     
    // If linked list is empty
    if (this.head == null)
        return;
     
    // Store head node
    var temp = this.head;
     
    // If head needs to be removed
    if (index == 0)
    {
        // Change head
        this.head = temp.next;
        return;
    }
     
    // Find previous node of the node to be deleted
    for(let i = 0; temp != null && i < index - 1; i++)
        temp = temp.next;
     
    // If index is more than number of nodes
    if (temp == null || temp.next == null)
    return;
     
    // Node temp->next is the node to be deleted
    // Store pointer to the next of node to be deleted
    var next = temp.next.next;
     
    // Unlink the deleted node from list
    temp.next = next;
    this.size--;
    }

    size(){
        return this.size;
    }

    toString(){
        let r = [];
        let current = this.head; 
        console.log(current)
        r.push(current.data)
        current = current.next
        for (let j = 1; j < this.size; j++) {
            r.push(" ---> "+ current.data)

            current = current.next;
        }
       return r;
    }

    search(val){ 
        let current = this.head; 
        for (let j = 0; j < this.size; j++) {
            if(val == current.data){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

class Node {
    constructor(data) {
      this.data = data
      this.next = null
    }
  }


