let solve = (str) =>{
    for(let i = str.length;i>=0;i--){
        let char = str.charAt(i);
        console.log(typeof(char));
    }
}

solve('abc');