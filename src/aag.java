// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aag
    implements android.app.ActionBar.OnMenuVisibilityListener
{

    final aaf a;
    private final pq b;

    public aag(aaf aaf, pq pq1)
    {
        a = aaf;
        super();
        b = pq1;
    }

    public void onMenuVisibilityChanged(boolean flag)
    {
        b.a(flag);
    }
}
