package work3;

import java.util.Comparator;

public class LftCamparator implements Comparator<Lft>{

	
	public int compare(Lft o1, Lft o2) {
		if(o1.getVolume()<o2.getVolume())
			return 1;
		else if(o1.getVolume()>o2.getVolume())
			return -1;
		else {
			if(o1.getHeight()+o1.getWidth()+o1.getLength()>o2.getHeight()+o2.getLength()+o2.getWidth())
				return 1;
			else if(o1.getHeight()+o1.getWidth()+o1.getLength()<o2.getHeight()+o2.getLength()+o2.getWidth())
				return -1;
			else {
				if(o1.getLength()<o2.getLength())
					return 1;
				else if(o1.getLength()>o2.getLength())
					return -1;
				else return 0;
			}
		}
	}


}
