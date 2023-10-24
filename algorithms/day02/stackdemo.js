function countDown(fromNumber) {
    console.log(fromNumber);
    if(fromNumber === 0) return 0;
    countDown(fromNumber-1);
}

countDown(3);