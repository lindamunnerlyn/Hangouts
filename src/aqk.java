// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class aqk
    implements aqm
{

    final ArrayList a;

    public aqk(ArrayList arraylist)
    {
        a = arraylist;
        super();
    }

    public boolean a(int i, StringBuilder stringbuilder)
    {
        a.add(stringbuilder.toString());
        return true;
    }
}
