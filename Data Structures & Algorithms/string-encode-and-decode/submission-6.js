class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        if (!strs.length) return "";
        return strs.join("-") + "$";
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        if (!str.length) return [];
        
        return str.slice(0, str.length - 1).split("-")
    }
}
