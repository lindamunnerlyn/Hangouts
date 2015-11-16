// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class cbb
    implements anb
{

    private final String a;
    private final Cursor b;

    public cbb(String s, Cursor cursor)
    {
        a = s;
        b = cursor;
    }

    public amx a()
    {
        String s = getString(11);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        gz gz1 = new gz();
        if (!TextUtils.isEmpty(s))
        {
            String as[] = s.split("#DELIM1#");
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                Object obj1 = as[i].split("#DELIM2#", -1);
                int k = Integer.parseInt(obj1[0]);
                String s3 = obj1[6];
                String s1 = obj1[7];
                String s2 = obj1[8];
                Object obj;
                if (!TextUtils.isEmpty(s3))
                {
                    obj = (amw)gz1.get(s3);
                    if (obj == null)
                    {
                        obj = new amw(s3);
                        gz1.put(s3, obj);
                    }
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    if (!TextUtils.isEmpty(s1))
                    {
                        ((amw) (obj)).a(s1);
                    }
                    if (!TextUtils.isEmpty(s2))
                    {
                        ((amw) (obj)).b(s2);
                    }
                }
                if (k == 0)
                {
                    boolean flag = eep.d(Integer.parseInt(obj1[4]));
                    obj1 = new and(obj1[3], obj1[1], obj1[2], obj1[10], flag);
                    arraylist.add(obj1);
                    if (obj != null)
                    {
                        ((amw) (obj)).a(((and) (obj1)));
                    }
                } else
                if (k == 1)
                {
                    obj1 = new amv(obj1[3], obj1[1]);
                    arraylist1.add(obj1);
                    if (obj != null)
                    {
                        ((amw) (obj)).a(((amv) (obj1)));
                    }
                }
                i++;
            }
        }
        obj = (new ana()).b(getString(5)).b(eep.d(getInt(8))).a(eep.d(getInt(9))).a().c(eep.d(getInt(6))).a(getString(4)).a(gz1.values()).c(arraylist).b(arraylist1);
        if (!isNull(1))
        {
            ((ana) (obj)).c(String.valueOf(getString(1)));
        }
        if (!isNull(2))
        {
            ((ana) (obj)).d(String.valueOf(getLong(2)));
        }
        return ((ana) (obj)).b();
    }

    public void a(List list)
    {
        if (b.getCount() > 0)
        {
            list.add(a);
        }
    }

    public int b()
    {
        return b.getCount() <= 0 ? 0 : 1;
    }

    public void close()
    {
        b.close();
    }

    public void copyStringToBuffer(int i, CharArrayBuffer chararraybuffer)
    {
        b.copyStringToBuffer(i, chararraybuffer);
    }

    public void deactivate()
    {
        b.deactivate();
    }

    public byte[] getBlob(int i)
    {
        return b.getBlob(i);
    }

    public int getColumnCount()
    {
        return b.getColumnCount();
    }

    public int getColumnIndex(String s)
    {
        return b.getColumnIndex(s);
    }

    public int getColumnIndexOrThrow(String s)
    {
        return b.getColumnIndexOrThrow(s);
    }

    public String getColumnName(int i)
    {
        return b.getColumnName(i);
    }

    public String[] getColumnNames()
    {
        return b.getColumnNames();
    }

    public int getCount()
    {
        return b.getCount();
    }

    public double getDouble(int i)
    {
        return b.getDouble(i);
    }

    public Bundle getExtras()
    {
        return b.getExtras();
    }

    public float getFloat(int i)
    {
        return b.getFloat(i);
    }

    public int getInt(int i)
    {
        return b.getInt(i);
    }

    public long getLong(int i)
    {
        return b.getLong(i);
    }

    public Uri getNotificationUri()
    {
        return b.getNotificationUri();
    }

    public int getPosition()
    {
        return b.getPosition();
    }

    public short getShort(int i)
    {
        return b.getShort(i);
    }

    public String getString(int i)
    {
        return b.getString(i);
    }

    public int getType(int i)
    {
        return b.getType(i);
    }

    public boolean getWantsAllOnMoveCalls()
    {
        return b.getWantsAllOnMoveCalls();
    }

    public boolean isAfterLast()
    {
        return b.isAfterLast();
    }

    public boolean isBeforeFirst()
    {
        return b.isBeforeFirst();
    }

    public boolean isClosed()
    {
        return b.isClosed();
    }

    public boolean isFirst()
    {
        return b.isFirst();
    }

    public boolean isLast()
    {
        return b.isLast();
    }

    public boolean isNull(int i)
    {
        return b.isNull(i);
    }

    public boolean move(int i)
    {
        return b.move(i);
    }

    public boolean moveToFirst()
    {
        return b.moveToFirst();
    }

    public boolean moveToLast()
    {
        return b.moveToLast();
    }

    public boolean moveToNext()
    {
        return b.moveToNext();
    }

    public boolean moveToPosition(int i)
    {
        return b.moveToPosition(i);
    }

    public boolean moveToPrevious()
    {
        return b.moveToPrevious();
    }

    public void registerContentObserver(ContentObserver contentobserver)
    {
        b.registerContentObserver(contentobserver);
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        b.registerDataSetObserver(datasetobserver);
    }

    public boolean requery()
    {
        return b.requery();
    }

    public Bundle respond(Bundle bundle)
    {
        return b.respond(bundle);
    }

    public void setExtras(Bundle bundle)
    {
        b.setExtras(bundle);
    }

    public void setNotificationUri(ContentResolver contentresolver, Uri uri)
    {
        b.setNotificationUri(contentresolver, uri);
    }

    public void unregisterContentObserver(ContentObserver contentobserver)
    {
        b.unregisterContentObserver(contentobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        b.unregisterDataSetObserver(datasetobserver);
    }
}
