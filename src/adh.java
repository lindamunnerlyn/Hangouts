// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class adh
{

    public static adh a = null;

    public adh()
    {
    }

    public static adh a()
    {
        if (a == null)
        {
            throw new IllegalStateException("MmsConfig is not initialized");
        } else
        {
            return a;
        }
    }

    public abstract boolean a(String s1);

    public abstract boolean a(String s1, String s2);

    public abstract int b();

    public abstract String b(String s1);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract boolean f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();

    public abstract int t();

    public abstract boolean u();

    public abstract boolean v();

    public abstract boolean w();

    public abstract String x();

}
