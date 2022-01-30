var apiKey = "81a44ffbafd54a15a5c7fb2d9c5b84b1";

var xhr = new XMLHttpRequest();
xhr.open("GET", "https://www.bungie.net/platform/Destiny/Manifest/InventoryItem/1274330687/", true);
xhr.setRequestHeader("X-API-Key", apiKey);

xhr.onreadystatechange = function(){
 if(this.readyState === 4 && this.status === 200){
  var json = JSON.parse(this.responseText);
  print(json.Response.data.inventoryItem.itemName); //Gjallarhorn
 }
}

xhr.send();