// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.AbstractCursor;
import java.util.List;

public final class anc extends AbstractCursor
    implements anb
{

    private static final String a[] = new String[0];
    private final List b;

    public anc(List list)
    {
        b = list;
    }

    public amx a()
    {
        return (amx)b.get(mPos);
    }

    public void a(List list)
    {
    }

    public int b()
    {
        return 0;
    }

    public String[] getColumnNames()
    {
        return a;
    }

    public int getCount()
    {
        return b.size();
    }

    public double getDouble(int i)
    {
        return 0.0D;
    }

    public float getFloat(int i)
    {
        return 0.0F;
    }

    public int getInt(int i)
    {
        return 0;
    }

    public long getLong(int i)
    {
        return 0L;
    }

    public short getShort(int i)
    {
        return 0;
    }

    public String getString(int i)
    {
        return null;
    }

    public boolean isClosed()
    {
        return false;
    }

    public boolean isNull(int i)
    {
        return false;
    }

}
