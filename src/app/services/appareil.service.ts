export class AppareilService {
    appareils = [
        {
        name: 'machine a laver',
        status: 'eteint'
        },
        {
        name: 'Frigo',
        status: 'allumes'
        },
        {
        name: 'ordinateur',
        status: 'eteint'
        }
       
        ];
switchOnAll(){
    for(let appareil of this.appareils){
    appareil.status= 'allume';
    }
}
switchOfAll(){
    for(let appareil of this.appareils){
     appareil.status = 'eteint';
    }
 }
 switchOnOne(index: number){
     this.appareils[index].status='allume';
 }
 switchOfOne(index: number){
    this.appareils[index].status='eteint';
}
}