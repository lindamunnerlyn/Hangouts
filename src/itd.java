// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itd
{

    final ith a;

    itd(ith ith1)
    {
        a = ith1;
    }

    public android.content.DialogInterface.OnClickListener a(android.content.DialogInterface.OnClickListener onclicklistener, String s)
    {
        return new ite(this, s, onclicklistener);
    }

    public void a(Class class1, String s)
    {
        ith ith1 = a;
        class1 = String.valueOf(class1.getSimpleName());
        ith1.a((new StringBuilder(String.valueOf(class1).length() + 2 + String.valueOf(s).length())).append(class1).append(": ").append(s).toString());
    }

    public void a(String s)
    {
        a.a(s);
    }
}
