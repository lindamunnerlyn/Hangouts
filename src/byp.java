// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class byp
    implements bym
{

    final byo a;

    byp(byo byo)
    {
        a = byo;
        super();
    }

    private static void a(Context context, List list, Class class1)
    {
        context = (byl)hlp.b(context, class1);
        if (context != null)
        {
            list.add(context);
        }
    }

    public List a(Context context)
    {
        ArrayList arraylist = new ArrayList();
        a(context, ((List) (arraylist)), byr);
        a(context, ((List) (arraylist)), byn);
        return arraylist;
    }
}
