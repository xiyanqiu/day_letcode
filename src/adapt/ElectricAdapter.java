package adapt;

import org.omg.CORBA.Object;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:adapt
 */
public class ElectricAdapter implements ObjectC {
    AlternateCurrent alternateCurrent;
    ElectricAdapter ()
    {

    }
    ElectricAdapter(AlternateCurrent alternateCurrent)
    {
        this.alternateCurrent = alternateCurrent;
    }
    @Override
    public String giveDirectCurrent() {
        String s = alternateCurrent.giveAlternateCurrent();
        StringBuffer sb = new StringBuffer(s);
        if(s!=null)
        {
            for(int i = 0;i<sb.length();i++)
            {
                if(sb.charAt(i)=='0')
                    sb.setCharAt(i,'1');

            }

            }
        s = new String(sb);
        return s;
        }

    }

