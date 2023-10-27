class Dog {

    constructor(name, breed){
        this.name = name;
        this.breed = breed;
    }

    bark(){
        console.log("woof");
    }
}

const fido = new Dog("fido", "Mutt");