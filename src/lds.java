// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class lds
    implements ldp
{

    protected lds()
    {
    }

    public int a(ldp ldp1)
    {
        long l = a();
        long l1 = ldp1.a();
        if (l < l1)
        {
            return -1;
        }
        return l <= l1 ? 0 : 1;
    }

    public int compareTo(Object obj)
    {
        return a((ldp)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ldp))
            {
                return false;
            }
            obj = (ldp)obj;
            if (a() != ((ldp) (obj)).a())
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        long l = a();
        return (int)(l ^ l >>> 32);
    }

    public String toString()
    {
        long l = a();
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("PT");
        boolean flag;
        if (l < 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lgj.a(stringbuffer, l);
        do
        {
            int i = stringbuffer.length();
            byte byte0;
            if (flag)
            {
                byte0 = 7;
            } else
            {
                byte0 = 6;
            }
            if (i >= byte0)
            {
                break;
            }
            if (flag)
            {
                byte0 = 3;
            } else
            {
                byte0 = 2;
            }
            stringbuffer.insert(byte0, "0");
        } while (true);
        if ((l / 1000L) * 1000L == l)
        {
            stringbuffer.setLength(stringbuffer.length() - 3);
        } else
        {
            stringbuffer.insert(stringbuffer.length() - 3, ".");
        }
        stringbuffer.append('S');
        return stringbuffer.toString();
    }
}
