export class tablesearch{
    searchTag?: number;
    searchName?: String;
    selectType?: number;

    constructor(searchTag?: number,searchName?: String,selectType?: number){
        this.searchTag = searchTag;
        this.searchName = searchName;
        this.selectType = selectType;
    }
}