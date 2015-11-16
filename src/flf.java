// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class flf
    implements android.os.Parcelable.Creator
{

    public flf()
    {
    }

    public static GroundOverlayOptions a(Parcel parcel)
    {
        boolean flag = false;
        LatLngBounds latlngbounds = null;
        float f = 0.0F;
        int j = g.a(parcel);
        float f1 = 0.0F;
        float f2 = 0.0F;
        float f3 = 0.0F;
        float f4 = 0.0F;
        float f5 = 0.0F;
        float f6 = 0.0F;
        LatLng latlng = null;
        android.os.IBinder ibinder = null;
        int i = 0;
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
                    ibinder = g.j(parcel, k);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)g.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    f6 = g.g(parcel, k);
                    break;

                case 5: // '\005'
                    f5 = g.g(parcel, k);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)g.a(parcel, k, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    f4 = g.g(parcel, k);
                    break;

                case 8: // '\b'
                    f3 = g.g(parcel, k);
                    break;

                case 9: // '\t'
                    flag = g.c(parcel, k);
                    break;

                case 10: // '\n'
                    f2 = g.g(parcel, k);
                    break;

                case 11: // '\013'
                    f1 = g.g(parcel, k);
                    break;

                case 12: // '\f'
                    f = g.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GroundOverlayOptions(i, ibinder, latlng, f6, f5, latlngbounds, f4, f3, flag, f2, f1, f);
            }
        } while (true);
    }

    public static void a(GroundOverlayOptions groundoverlayoptions, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, groundoverlayoptions.b());
        g.a(parcel, 2, groundoverlayoptions.a());
        g.a(parcel, 3, groundoverlayoptions.c(), i);
        g.a(parcel, 4, groundoverlayoptions.d());
        g.a(parcel, 5, groundoverlayoptions.e());
        g.a(parcel, 6, groundoverlayoptions.f(), i);
        g.a(parcel, 7, groundoverlayoptions.g());
        g.a(parcel, 8, groundoverlayoptions.h());
        g.a(parcel, 9, groundoverlayoptions.l());
        g.a(parcel, 10, groundoverlayoptions.i());
        g.a(parcel, 11, groundoverlayoptions.j());
        g.a(parcel, 12, groundoverlayoptions.k());
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new GroundOverlayOptions[i];
    }
}
