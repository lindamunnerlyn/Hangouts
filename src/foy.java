// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.CursorWrapper;

final class foy extends CursorWrapper
{

    private int a;

    public foy(Cursor cursor)
    {
        super(cursor);
        a = 100;
    }

    public int getCount()
    {
        return Math.min(super.getCount(), a);
    }
}
