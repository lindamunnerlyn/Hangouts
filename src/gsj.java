// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

final class gsj
    implements gsc
{

    Set a;

    gsj(Set set)
    {
        a = set;
    }

    public Object a(Object obj)
    {
        return a;
    }

    public void a(android.content.SharedPreferences.Editor editor, String s)
    {
        editor.putStringSet(s, a);
    }
}
