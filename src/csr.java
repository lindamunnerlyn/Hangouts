// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class csr extends csm
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final String b;

    public csr(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public kop a(String s, int i, int j)
    {
        s = new hum();
        s.b = b;
        s.a = a;
        Object obj = new hun();
        obj.g = Boolean.valueOf(false);
        obj.i = Boolean.valueOf(false);
        obj.a = Boolean.valueOf(false);
        obj.h = Boolean.valueOf(false);
        obj.l = Boolean.valueOf(true);
        obj.e = Boolean.valueOf(false);
        obj.f = Boolean.valueOf(true);
        obj.d = Boolean.valueOf(false);
        obj.b = Boolean.valueOf(true);
        obj.c = Boolean.valueOf(true);
        obj.k = Integer.valueOf(1);
        s.c = ((hun) (obj));
        obj = new hta();
        obj.a = s;
        return ((kop) (obj));
    }

    public String g()
    {
        return "getphoto";
    }
}
