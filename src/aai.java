// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aai
    implements android.app.ActionBar.OnMenuVisibilityListener
{

    final aah a;
    private final ps b;

    public aai(aah aah, ps ps1)
    {
        a = aah;
        super();
        b = ps1;
    }

    public void onMenuVisibilityChanged(boolean flag)
    {
        b.a(flag);
    }
}
