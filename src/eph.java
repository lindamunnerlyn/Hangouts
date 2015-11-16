// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.CursorWindow;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

public final class eph
    implements android.os.Parcelable.Creator
{

    public eph()
    {
    }

    public static DataHolder a(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int k = g.a(parcel);
        CursorWindow acursorwindow[] = null;
        String as[] = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    as = g.m(parcel, l);
                    break;

                case 1000: 
                    j = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    acursorwindow = (CursorWindow[])g.b(parcel, l, CursorWindow.CREATOR);
                    break;

                case 3: // '\003'
                    i = g.e(parcel, l);
                    break;

                case 4: // '\004'
                    bundle = g.k(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                parcel = new DataHolder(j, as, acursorwindow, i, bundle);
                parcel.a();
                return parcel;
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new DataHolder[i];
    }
}
