/** 2) Create a function that takes the dimensions of two triangles (as arrays) and checks if the first triangle fits into the second one. 

        Examples: 
        doesTriangleFit([1, 1, 1], [1, 1, 1]) ➞ true 

        doesTriangleFit([1, 1, 1], [2, 2, 2]) ➞ true 

        doesTriangleFit([1, 2, 3], [1, 2, 2]) ➞ false 

        doesTriangleFit([1, 2, 4], [1, 2, 6]) ➞ false 

        Notes: 
        Triangle fits if it has the same or smaller size as the hole. 
        The function should return false if the triangle with that dimensions is not possible. */


console.log(doesTriangleFit([1, 1, 1], [1, 1, 1]));
console.log(doesTriangleFit([1, 1, 1], [2, 2, 2]));
console.log(doesTriangleFit([1, 2, 3], [1, 2, 2]));
console.log(doesTriangleFit([1, 2, 4], [1, 2, 6]));

function doesTriangleFit(t1, t2){
        //sort triangle sides smallest-largest
        t1.sort(function(x,y){return x - y}) 
        t2.sort(function(x,y){return x - y})

        //return false if the triangle with provided dimensions is not possible
        if((t1[0] + t1[1] <= t1[2]) || (t2[0] + t2[1] <= t2[2])) return false;

        //return true if all of the sides of t1 are less than or equal to the sides of t2
        if(t1[0] <= t2[0] && t1[1] <= t2[1] && t1[2] <= t2[2]) return true;

        //else return false
        return false;
}
        