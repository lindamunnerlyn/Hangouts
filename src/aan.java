// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aan
    implements android.view.View.OnSystemUiVisibilityChangeListener
{

    final aam a;

    aan(aam aam1)
    {
        a = aam1;
        super();
    }

    public void onSystemUiVisibilityChange(int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19 && i == 0 && a.d == 3846)
        {
            a.a(false, true);
        }
    }
}
