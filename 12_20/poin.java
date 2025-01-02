class myPointSet{
    class myPoint{
        int x, y;

        myPoint(int xt, int yt){
            x = xt;
            y = yt;
        }

        double dist(myPoint other){
            int xt = (this.x - other.x);
            int yt = (this.y - other.y);

            return Math.sqrt((xt*xt) + (yt*yt));
        };
    }

    myPoint[] points;

    int pointIndex = 0;

    myPointSet(int size){
    points = new myPoint[size];
    }

    void setValue(int x, int y){
        if(pointIndex < points.length){
            points[pointIndex++] = new myPoint(x,y);
        }
    }

    double completeLinkage(myPointSet other){
        double findMax = 0;
        for(int i = 0; i < this.pointIndex; i++){
            for(int j = 0; j < other.pointIndex; j++){
                double ret = this.points[i].dist(other.points[j]);
                if(ret > findMax){
                    findMax = ret;
                }
            }
        }

        return findMax;
    }

    double singleLinkage(myPointSet other){
        boolean first = true;
        double findMin = 0;
        for(int i = 0; i < this.pointIndex; i++){
            for(int j = 0; j < other.pointIndex; j++){
                double ret = this.points[i].dist(other.points[j]);

                if(first){
                    findMin = ret;
                    first = false;
                    continue;
                }else if(ret < findMin){
                    findMin = ret;
                }
            }
        }

        return findMin;
    }

    double averageLinkage(myPointSet other){
        double average = 0;
        int count = 0;

        for(int i = 0; i < this.pointIndex; i++){
            for(int j = 0; j < other.pointIndex; j++){
                double ret = this.points[i].dist(other.points[j]);
                average += ret;
                count ++;
            }
        }
        average /= count;

        return average;
    }
}

class poin{
    public static void main(String[] argc){
        //init
        myPointSet setA = new myPointSet(3);
        myPointSet setB = new myPointSet(3);
        
        //setValue A,B
        setA.setValue(1, 2);
        setA.setValue(3, 4);
        setA.setValue(5, 6);

        setB.setValue(7, 8);
        setB.setValue(9, 10);
        setB.setValue(11, 12);

        //print Out
        System.out.println(setA.points[0].dist(setB.points[1]));

        System.out.println(setA.completeLinkage(setB));
        System.out.println(setA.singleLinkage(setB));
        System.out.println(setA.averageLinkage(setB));
    }
}