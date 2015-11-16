// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gsd
    implements gsc
{

    float a;

    gsd(float f)
    {
        a = f;
    }

    public Object a(Object obj)
    {
        return Float.valueOf(a);
    }

    public void a(android.content.SharedPreferences.Editor editor, String s)
    {
        editor.putFloat(s, a);
    }
}
