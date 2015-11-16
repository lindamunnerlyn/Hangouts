// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gsi
    implements gsc
{

    String a;

    gsi(String s)
    {
        a = s;
    }

    public Object a(Object obj)
    {
        return a;
    }

    public void a(android.content.SharedPreferences.Editor editor, String s)
    {
        editor.putString(s, a);
    }
}
