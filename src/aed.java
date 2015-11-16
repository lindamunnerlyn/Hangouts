// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aed
    implements adz
{

    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    public String k;

    public aed()
    {
    }

    public final aeb a()
    {
        return aeb.a;
    }

    public boolean b()
    {
        return TextUtils.isEmpty(a) && TextUtils.isEmpty(b) && TextUtils.isEmpty(c) && TextUtils.isEmpty(d) && TextUtils.isEmpty(e);
    }

    public boolean c()
    {
        return TextUtils.isEmpty(g) && TextUtils.isEmpty(h) && TextUtils.isEmpty(i);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof aed))
            {
                return false;
            }
            obj = (aed)obj;
            if (!TextUtils.equals(a, ((aed) (obj)).a) || !TextUtils.equals(c, ((aed) (obj)).c) || !TextUtils.equals(b, ((aed) (obj)).b) || !TextUtils.equals(d, ((aed) (obj)).d) || !TextUtils.equals(e, ((aed) (obj)).e) || !TextUtils.equals(f, ((aed) (obj)).f) || !TextUtils.equals(g, ((aed) (obj)).g) || !TextUtils.equals(i, ((aed) (obj)).i) || !TextUtils.equals(h, ((aed) (obj)).h) || !TextUtils.equals(j, ((aed) (obj)).j))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        String s = a;
        String s1 = c;
        String s2 = b;
        String s3 = d;
        String s4 = e;
        String s5 = f;
        String s6 = g;
        String s7 = i;
        String s8 = h;
        String s9 = j;
        int i1 = 0;
        int l = 0;
        while (i1 < 10) 
        {
            String s10 = (new String[] {
                s, s1, s2, s3, s4, s5, s6, s7, s8, s9
            })[i1];
            int j1;
            if (s10 != null)
            {
                j1 = s10.hashCode();
            } else
            {
                j1 = 0;
            }
            i1++;
            l = l * 31 + j1;
        }
        return l;
    }

    public String toString()
    {
        return String.format("family: %s, given: %s, middle: %s, prefix: %s, suffix: %s", new Object[] {
            a, b, c, d, e
        });
    }
}
