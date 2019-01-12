class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def printme(self):
        print(self.val, end="")
        if self.next != None:
            print("->", end="")
            self.next.printme()
        else:
            print("")

class Solution:
    def addTwoNumbers(self, l1, l2, c=0):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        val = l1.val + l2.val + c
        c = val // 10
        ret = ListNode(val % 10)

        if (l1.next != None or l2.next != None or c != 0):
            if l1.next == None:
                l1.next = ListNode(0)
            if l2.next == None:
                l2.next = ListNode(0)
            ret.next = self.addTwoNumbers(l1.next, l2.next, c)
        return ret

def arrayToListNode(nums):
    ret = ListNode(0)
    headNode = ret
    for i in nums:
        ret.next = ListNode(i)
        ret = ret.next
    return headNode.next


numList1 = arrayToListNode([2,3,4,5])
numList2 = arrayToListNode([5,6,7,8,9])
print("ListNode 1:")
numList1.printme()
print("ListNode 2:")
numList2.printme()

solution = Solution()
resultList = solution.addTwoNumbers(numList1, numList2)
print("Result:")
resultList.printme()

