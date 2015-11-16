// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.google.android.apps.hangouts.fragments.BabelPhotoViewFragment;

public final class cjz extends abd
{

    final boolean j = false;

    public cjz(Context context, ap ap, Cursor cursor, float f)
    {
        super(context, ap, null, f, false);
    }

    public ad a(Cursor cursor, int i)
    {
        Object obj = b(cursor);
        String s = c(cursor);
        boolean flag2 = d(cursor);
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj == null)
        {
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        aah aah1 = g.a(a, abe);
        aah1.c(((String) (obj))).d(s).a(j).a(h);
        obj = aah1.b();
        ((Intent) (obj)).putExtra("content_type", cursor.getString(cursor.getColumnIndex("contentType")));
        return BabelPhotoViewFragment.b(((Intent) (obj)), i, flag);
    }
}
