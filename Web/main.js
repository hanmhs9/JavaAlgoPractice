function doFirst() {
    var imageLoader = document.getElementById('upload');
    imageLoader.addEventListener('change', handleImage, false);
     canvas = document.getElementById('canvas');
     ctx = canvas.getContext('2d');

    hidden =false;
    hidden1=false;
    hidden2=false;
    hidden3=false;
    document.getElementById('rotate2').style.visibility='hidden';
    document.getElementById('scale2').style.visibility='hidden';
    document.getElementById('translate2').style.visibility='hidden';
    document.getElementById('opacity2').style.visibility='hidden';
    rotated=false;
    translated=false;
    opacityChanged=false;
    scaled=false;
    angle=0;
    cpx=0;
    cpy=0;

}
   function handleImage(e) {
        var reader = new FileReader();
        reader.onload = function (event) {
            img = new Image();
                img.onload = function () {
                    if(img.width<=500 && img.height<=500) {
                        canvas.width = img.width * 2;
                        canvas.height = img.height * 2;
                    }
                    else{
                        alert("image file is too big, try with smaller image. " +
                            "Maximum size: 500x500px");
                        return;
                    }
                    cpx=canvas.width/4;
                    cpy=canvas.height/4;
                    ctx.clearRect(0,0,canvas.width,canvas.height);
                ctx.drawImage(img, cpx, cpy);

            }
            img.src = event.target.result;


        }
        reader.readAsDataURL(e.target.files[0]);

    }


function drawRotated(degrees){
    hidden=!hidden;
    if(hidden){
        document.getElementById('rotate').style.visibility='hidden';
        document.getElementById('rotate2').style.visibility='visible';
    }else {
        document.getElementById('rotate').style.visibility='visible';
        document.getElementById('rotate2').style.visibility='hidden';
    }
    angle+=degrees;
    ctx.clearRect(0,0,canvas.width,canvas.height);
    ctx.save();
    if(angle==45) {
        if(!translated&&!scaled) {
            ctx.translate(canvas.width / 2, canvas.height / 2);
            ctx.rotate(angle * Math.PI / 180);
            ctx.drawImage(img, -img.width / 2.2, -img.width / 2.2);
        }
        else if(translated&&!scaled){
            ctx.translate(canvas.width /2, canvas.height /2);
            ctx.rotate(angle * Math.PI / 180);
            ctx.drawImage(img, -img.width/2.2-Math.sqrt(800), -img.width / 2.2+Math.sqrt(800));
        }
        else if(!translated&&scaled){
            ctx.translate(canvas.width /2, canvas.height /2);
            ctx.rotate(angle * Math.PI / 180);
            ctx.scale(0.5,0.5);
            ctx.drawImage(img, -img.width, -img.width / 4.4);
        }
        else if(translated&&scaled){
            ctx.translate(canvas.width / 2, canvas.height / 2);
            ctx.rotate(angle * Math.PI / 180);
            ctx.scale(0.5,0.5);
            ctx.drawImage(img, -img.width-Math.sqrt(1600), -img.width / 4.4+Math.sqrt(1600));

        }
    }
    else if(angle==0) {
        if (!scaled) {
            ctx.drawImage(img, cpx, cpy);
        }
        else if (scaled) {
            ctx.scale(0.5, 0.5);
            ctx.drawImage(img, cpx / 0.5, cpy / 0.5);
        }
    }
    ctx.restore();
    rotated=!rotated;
}
function drawTranslated(pixels){
    hidden1=!hidden1;
    cpx+=pixels;
    if(hidden1){
        document.getElementById('translate').style.visibility='hidden';
        document.getElementById('translate2').style.visibility='visible';
    }else {
        document.getElementById('translate').style.visibility='visible';
        document.getElementById('translate2').style.visibility='hidden';
    }
    ctx.clearRect(0,0,canvas.width,canvas.height);
    ctx.save();
    if(!rotated&&!scaled){
        //ctx.translate(canvas.width-40,canvas.height);
        ctx.drawImage(img,cpx,cpy);
    }
    else if(!rotated&&scaled){
        ctx.scale(0.5,0.5);
        ctx.drawImage(img,cpx/0.5,cpy/0.5);
    }
    else if(rotated&&!translated&&!scaled){
        ctx.translate(canvas.width/2,canvas.height/2);
        ctx.rotate(angle*Math.PI/180);
        ctx.drawImage(img,-img.width/2.2-Math.sqrt(800),-img.width/2.2+Math.sqrt(800));

    }
    else if(rotated&&translated&&!scaled){
        ctx.translate(canvas.width/2,canvas.height/2);
        ctx.rotate(angle*Math.PI/180);
        ctx.drawImage(img,-img.width/2.2,-img.width/2.2);

    }
    else if(rotated&&translated&&scaled){
        ctx.translate(canvas.width/2,canvas.height/2);
        ctx.rotate(angle*Math.PI/180);
        ctx.scale(0.5, 0.5);
        ctx.drawImage(img,-img.width,-img.width/4.4);

    }
    else if(rotated&&!translated&&scaled){
        ctx.translate(canvas.width/2,canvas.height/2);
        ctx.rotate(angle*Math.PI/180);
        ctx.scale(0.5, 0.5);
        ctx.drawImage(img,-img.width-Math.sqrt(3200) ,-img.width/4.4+Math.sqrt(3200));

    }
    ctx.restore();
    translated=!translated;

}
function changeOpacity(num){
    hidden2=!hidden2;
    if(hidden2){
        document.getElementById('opacity').style.visibility='hidden';
        document.getElementById('opacity2').style.visibility='visible';
    }else {
        document.getElementById('opacity').style.visibility='visible';
        document.getElementById('opacity2').style.visibility='hidden';
    }
    canvas.style.opacity= num;
}
function toScale(num){
    hidden3=!hidden3;
    if(hidden3){
        document.getElementById('scale').style.visibility='hidden';
        document.getElementById('scale2').style.visibility='visible';
    }else {
        document.getElementById('scale').style.visibility='visible';
        document.getElementById('scale2').style.visibility='hidden';
    }
    ctx.clearRect(0,0,canvas.width,canvas.height);
    ctx.save();
    if(!rotated&&!translated) {
        ctx.scale(num, num);
        ctx.drawImage(img, cpx / num, cpy / num);
    }
    else if(rotated && !translated){
        ctx.translate(canvas.width/2,canvas.height/2);
        ctx.rotate(angle*Math.PI/180);
        ctx.scale(num, num);
        ctx.drawImage(img,-img.width/2.2,-img.width/2.2);
    }
    else if(!rotated && translated){
        ctx.scale(num, num);
        ctx.drawImage(img, cpx / num , cpy / num);
    }
    else if(rotated&&translated&&!scaled){
        ctx.translate(canvas.width/2,canvas.height/2);
        ctx.rotate(angle*Math.PI/180);
        ctx.scale(num, num);
        ctx.drawImage(img,-img.width-Math.sqrt(1600),-img.width/4.4+Math.sqrt(1600));
    }
    else if(rotated&&translated&&scaled){
        ctx.translate(canvas.width/2,canvas.height/2);
        ctx.rotate(angle*Math.PI/180);
        ctx.scale(num, num);
        ctx.drawImage(img,-img.width/2.2-Math.sqrt(1600),-img.width/2.2+Math.sqrt(1600));
    }
    ctx.restore();
    scaled=!scaled;
}
function resetter(){
    hidden=false;
    hidden1=false;
    hidden2=false;
    hidden3=false;
    document.getElementById('scale').style.visibility='visible';
    document.getElementById('scale2').style.visibility='hidden';
    document.getElementById('opacity').style.visibility='visible';
    document.getElementById('opacity2').style.visibility='hidden';
    document.getElementById('rotate').style.visibility='visible';
    document.getElementById('rotate2').style.visibility='hidden';
    document.getElementById('translate').style.visibility='visible';
    document.getElementById('translate2').style.visibility='hidden';
    rotated=false;
    translated=false;
    scaled=false;
    angle=0;
    cpx=canvas.width/4;
    ctx.clearRect(0,0,canvas.width,canvas.height);
    ctx.save();
    canvas.style.opacity=1;
    ctx.drawImage(img, cpx, cpy);
    ctx.restore();
}
window.addEventListener('load',doFirst,false);


