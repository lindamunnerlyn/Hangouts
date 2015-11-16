// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eew
{

    private final long a = System.currentTimeMillis();
    private final String b;
    private long c;

    public eew(String s)
    {
        b = s;
        c = a;
    }

    public void a(String s)
    {
        long l = System.currentTimeMillis();
        long l1 = a;
        long l2 = c;
        c = l;
        String s1 = b;
        eev.e("Babel/TL", (new StringBuilder(String.valueOf(s1).length() + 60 + String.valueOf(s).length())).append(s1).append(":").append(s).append(" in ").append(l - l2).append(" ms, total: ").append(l - l1).append(" ms").toString());
    }
}
