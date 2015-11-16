// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aej
    implements ady
{

    final ads a;
    private StringBuilder b;
    private boolean c;

    aej(ads ads)
    {
        a = ads;
        super();
    }

    public void a()
    {
        b = new StringBuilder();
        StringBuilder stringbuilder = b;
        int i = a.hashCode();
        stringbuilder.append((new StringBuilder(20)).append("[[hash: ").append(i).append("\n").toString());
    }

    public void a(adz adz1)
    {
        b.append(String.valueOf(adz1.toString()).concat(": "));
        c = true;
    }

    public boolean a(adx adx)
    {
        if (!c)
        {
            b.append(", ");
            c = false;
        }
        b.append("[").append(adx.toString()).append("]");
        return true;
    }

    public void b()
    {
        b.append("]]\n");
    }

    public void c()
    {
        b.append("\n");
    }

    public String toString()
    {
        return b.toString();
    }
}
