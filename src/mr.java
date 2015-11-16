// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mr
{

    public static final mr a = new mr(1);
    public static final mr b = new mr(2);
    public static final mr c = new mr(4);
    public static final mr d = new mr(8);
    public static final mr e = new mr(16);
    public static final mr f = new mr(32);
    public static final mr g = new mr(64);
    public static final mr h = new mr(128);
    public static final mr i = new mr(256);
    public static final mr j = new mr(512);
    public static final mr k = new mr(1024);
    public static final mr l = new mr(2048);
    public static final mr m = new mr(4096);
    public static final mr n = new mr(8192);
    public static final mr o = new mr(16384);
    public static final mr p = new mr(32768);
    public static final mr q = new mr(0x10000);
    public static final mr r = new mr(0x20000);
    public static final mr s = new mr(0x40000);
    public static final mr t = new mr(0x80000);
    public static final mr u = new mr(0x100000);
    public static final mr v = new mr(0x200000);
    private final Object w;

    private mr(int i1)
    {
        this(mq.o().a(i1, null));
    }

    private mr(Object obj)
    {
        w = obj;
    }

    static Object a(mr mr1)
    {
        return mr1.w;
    }

}
