// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.DataInput;

final class lgq
{

    final lgo a;
    final String b;
    final int c;

    private lgq(lgo lgo1, String s, int i)
    {
        a = lgo1;
        b = s;
        c = i;
    }

    static lgq a(DataInput datainput)
    {
        return new lgq(new lgo((char)datainput.readUnsignedByte(), datainput.readUnsignedByte(), datainput.readByte(), datainput.readUnsignedByte(), datainput.readBoolean(), (int)g.a(datainput)), datainput.readUTF(), (int)g.a(datainput));
    }

    public long a(long l, int i, int j)
    {
        return a.a(l, i, j);
    }

    public String a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public long b(long l, int i, int j)
    {
        return a.b(l, i, j);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof lgq)
            {
                if (c != ((lgq) (obj = (lgq)obj)).c || !b.equals(((lgq) (obj)).b) || !a.equals(((lgq) (obj)).a))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }
}
