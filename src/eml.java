// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

public class eml
{

    public final DataHolder a;
    public int b;
    private int c;

    public eml(DataHolder dataholder, int i)
    {
        a = (DataHolder)h.a(dataholder);
        a(i);
    }

    public int a(String s)
    {
        return a.a(s, b, c);
    }

    protected void a(int i)
    {
        boolean flag;
        if (i >= 0 && i < a.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag);
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
        if (obj instanceof eml)
        {
            obj = (eml)obj;
            flag = flag1;
            if (g.a(Integer.valueOf(((eml) (obj)).b), Integer.valueOf(b)))
            {
                flag = flag1;
                if (g.a(Integer.valueOf(((eml) (obj)).c), Integer.valueOf(c)))
                {
                    flag = flag1;
                    if (((eml) (obj)).a == a)
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
