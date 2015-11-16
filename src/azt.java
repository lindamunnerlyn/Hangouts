// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.CursorWrapper;

final class azt extends CursorWrapper
{

    final int a;

    public azt(Cursor cursor)
    {
        super(cursor);
        a = cursor.getCount();
    }

    public int getPosition()
    {
        return a - super.getPosition() - 1;
    }

    public boolean isAfterLast()
    {
        return super.isBeforeFirst();
    }

    public boolean isBeforeFirst()
    {
        return super.isAfterLast();
    }

    public boolean isFirst()
    {
        return super.isLast();
    }

    public boolean isLast()
    {
        return super.isFirst();
    }

    public boolean move(int i)
    {
        return super.move(-i);
    }

    public boolean moveToFirst()
    {
        return super.moveToLast();
    }

    public boolean moveToLast()
    {
        return super.moveToFirst();
    }

    public boolean moveToNext()
    {
        return super.moveToPrevious();
    }

    public boolean moveToPosition(int i)
    {
        return super.moveToPosition(a - i - 1);
    }

    public boolean moveToPrevious()
    {
        return super.moveToNext();
    }
}
