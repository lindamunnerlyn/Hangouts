// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

public class epl
{

    public final DataHolder a;
    public int b;
    private int c;

    public epl(DataHolder dataholder, int i)
    {
        a = (DataHolder)g.d(dataholder);
        a(i);
    }

    public boolean C_()
    {
        return !a.e();
    }

    public int a(String s)
    {
        return a.a(s, b, c);
    }

    protected void a(int i)
    {
        boolean flag;
        if (i >= 0 && i < a.d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag);
        b = i;
        c = a.a(b);
    }

    public String b(String s)
    {
        return a.b(s, b, c);
    }

    public byte[] c(String s)
    {
        return a.c(s, b, c);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof epl)
        {
            obj = (epl)obj;
            flag = flag1;
            if (g.a(Integer.valueOf(((epl) (obj)).b), Integer.valueOf(b)))
            {
                flag = flag1;
                if (g.a(Integer.valueOf(((epl) (obj)).c), Integer.valueOf(c)))
                {
                    flag = flag1;
                    if (((epl) (obj)).a == a)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c), a
        });
    }
}
