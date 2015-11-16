// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class imz
{

    private final ind a;

    imz(ind ind)
    {
        a = ind;
    }

    static ind a(imz imz1)
    {
        return imz1.a;
    }

    public android.content.DialogInterface.OnClickListener a(android.content.DialogInterface.OnClickListener onclicklistener, String s)
    {
        return new ina(this, s, onclicklistener);
    }
}
