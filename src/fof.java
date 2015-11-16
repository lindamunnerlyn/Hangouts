// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;

public final class fof
    implements android.os.Parcelable.Creator
{

    public fof()
    {
    }

    public static PointOfInterest a(Parcel parcel)
    {
        int j = g.a(parcel);
        String s = null;
        LatLng latlng = null;
        int i = 0;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)g.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = g.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PointOfInterest(i, latlng, s, s1);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new PointOfInterest[i];
    }
}
