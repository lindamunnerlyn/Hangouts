// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public final class fld
    implements android.os.Parcelable.Creator
{

    public fld()
    {
    }

    public static CameraPosition a(Parcel parcel)
    {
        float f = 0.0F;
        int j = g.a(parcel);
        int i = 0;
        LatLng latlng = null;
        float f1 = 0.0F;
        float f2 = 0.0F;
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
                    f2 = g.g(parcel, k);
                    break;

                case 4: // '\004'
                    f1 = g.g(parcel, k);
                    break;

                case 5: // '\005'
                    f = g.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CameraPosition(i, latlng, f2, f1, f);
            }
        } while (true);
    }

    public static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, cameraposition.a());
        g.a(parcel, 2, cameraposition.a, i);
        g.a(parcel, 3, cameraposition.b);
        g.a(parcel, 4, cameraposition.c);
        g.a(parcel, 5, cameraposition.d);
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new CameraPosition[i];
    }
}
