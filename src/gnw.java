// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gnw
    implements gnu
{

    int a;

    gnw(int i)
    {
        a = i;
    }

    public Object a(Object obj)
    {
        return Integer.valueOf(a);
    }

    public void a(android.content.SharedPreferences.Editor editor, String s)
    {
        editor.putInt(s, a);
    }
}
