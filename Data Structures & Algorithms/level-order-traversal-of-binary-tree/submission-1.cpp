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
    vector<vector<int>> levelOrder(TreeNode* root) {
        if(root == nullptr){
            return {};
        }
        int max = 1;
        std::queue<TreeNode*> que;
        que.push(root);
        std::vector<vector<int>> answer;
        std::vector<int> holder;
        std::vector<TreeNode*> children;
        while(!que.empty()){
            while(!que.empty()){
                TreeNode* current = que.front();
                if(current->left != nullptr){
                    children.push_back(current->left); 
                }  
                if(current->right != nullptr){
                    children.push_back(current->right); 
                }
                holder.push_back(current->val);
                que.pop();
            }
            for(TreeNode* i: children){
                que.push(i);
            }
            answer.push_back(holder);
            holder = {};
            children = {};
        }
        if(holder.size()>0){
            answer.push_back(holder);
        }
        return answer;

    }
};
