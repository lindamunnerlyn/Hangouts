// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class hax
    implements hav
{

    public static final android.os.Parcelable.Creator CREATOR = new hay();
    final List a;
    final List b;

    public hax()
    {
        a = new ArrayList();
        b = new ArrayList();
    }

    public hax(Parcel parcel)
    {
        a = new ArrayList();
        b = new ArrayList();
        parcel.readStringList(a);
        parcel.readStringList(b);
    }

    public hax a(String s)
    {
        a.add(s);
        return this;
    }

    public boolean a(int i, grb grb1)
    {
        i = 0;
_L7:
        if (i >= a.size()) goto _L2; else goto _L1
_L1:
        if (grb1.d((String)a.get(i))) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= b.size())
                {
                    break label1;
                }
                if (grb1.d((String)b.get(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public hax b(String s)
    {
        b.add(s);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStringList(a);
        parcel.writeStringList(b);
    }

}
