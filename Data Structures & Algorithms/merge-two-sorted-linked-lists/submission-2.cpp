/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* answer = new ListNode();
        ListNode* final = answer;
        while(list1 != nullptr && list2 != nullptr){
            if(list1->val<list2->val){
                answer->next = new ListNode(list1->val);
                answer = answer->next;
                list1 = list1->next;
            }
            else{
                answer->next = new ListNode(list2->val);
                answer = answer->next;
                list2 = list2->next;
            }
        }
        while(list1!=nullptr){
            answer->next = new ListNode(list1->val);
            answer = answer->next;
            list1 = list1->next;
        }
        while(list2!=nullptr){
            answer->next = new ListNode(list2->val);
            answer = answer->next;
            list2 = list2->next;
        }
        return final->next;
    }
};
