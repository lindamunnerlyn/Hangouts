// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dc
    implements dk
{

    final String a;
    final int b;
    final String c;
    final boolean d = false;

    public dc(String s, int i, String s1)
    {
        a = s;
        b = i;
        c = s1;
    }

    public void a(bn bn1)
    {
        if (d)
        {
            bn1.a(a);
            return;
        } else
        {
            bn1.a(a, b, c);
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("CancelTask[");
        stringbuilder.append("packageName:").append(a);
        stringbuilder.append(", id:").append(b);
        stringbuilder.append(", tag:").append(c);
        stringbuilder.append(", all:").append(d);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
