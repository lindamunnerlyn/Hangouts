// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gsb
    implements gsc
{

    boolean a;

    gsb(boolean flag)
    {
        a = flag;
    }

    public Object a(Object obj)
    {
        return Boolean.valueOf(a);
    }

    public void a(android.content.SharedPreferences.Editor editor, String s)
    {
        editor.putBoolean(s, a);
    }
}
