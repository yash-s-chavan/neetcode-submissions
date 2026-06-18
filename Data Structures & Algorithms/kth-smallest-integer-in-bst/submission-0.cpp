/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    int counter = 0;
    int answer = 0;
    int kthSmallest(TreeNode* root, int k) {
        traverse(root, k);
        return answer;
    }
    void traverse(TreeNode*& root, int k){
        if(root == nullptr){
            return;
        }
        traverse(root->left, k);
        counter++;
        if(counter == k){
            answer = root->val;
            return;
        }
        traverse(root->right, k);

    
    }
};
