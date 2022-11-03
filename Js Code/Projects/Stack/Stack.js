class Node {
    constructor(data) {
      this.data = data
      this.next = null
    }
  }
  
  class StackAsLinkedList {
    constructor(head = null) {
      this.head = head
      this.lastNode = head
      this.secondToLast = [null, null]
    }
    
    top(){
      if (!this.head) {
        return null 
      }
      return this.lastNode[1]
    }
  
    push(newNode) {
      if (!this.head) {
        this.head = [this.secondToLast, newNode]
        this.lastNode = this.head
      }
      else {
        this.secondToLast = this.lastNode
        this.lastNode.next = [this.secondToLast, newNode]
        this.lastNode = this.lastNode.next
      }
    }
  
    pop() {
      this.secondToLast = this.lastNode[0] 
      this.lastNode = this.secondToLast
      this.secondToLast.next = null
    }
  }
  
  var myStack = new StackAsLinkedList()
  myStack.push(new Node(1))
  myStack.push(new Node(5))
  myStack.push(new Node(3))
  myStack.push(new Node(10))
  console.log(myStack.top().data)
  myStack.push(new Node(7))
  console.log(myStack.top().data)
  myStack.pop()
  console.log(myStack.top().data)
  myStack.pop()
  console.log(myStack.top().data)
  myStack.pop()
  console.log(myStack.top().data)