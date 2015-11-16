// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cnn extends cnr
{

    final cnm a;

    cnn(cnm cnm1, cnl cnl, CharSequence charsequence)
    {
        a = cnm1;
        super(cnl, charsequence);
    }

    public int a(int i)
    {
        int k;
label0:
        {
            int l = a.a.length();
label1:
            for (int i1 = d.length(); i <= i1 - l; i++)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= l)
                    {
                        break label0;
                    }
                    if (d.charAt(j + i) != a.a.charAt(j))
                    {
                        continue label1;
                    }
                    j++;
                } while (true);
            }

            k = -1;
        }
        return k;
    }

    public int b(int i)
    {
        return a.a.length() + i;
    }
}
