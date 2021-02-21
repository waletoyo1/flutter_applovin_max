package dev.iori.flutter_applovin_max;

import com.applovin.mediation.MaxAd;

import com.applovin.mediation.ads.BannerAd;


import io.flutter.Log;



public class BannerAd extends Activity
        implements MaxAdViewAdListener
{
    private MaxAdView adView;

    void createBannerAd
    {
        adView = new MaxAdView( "YOUR_AD_UNIT_ID", this );
        adView.setListener( this );
    
        // Stretch to the width of the screen for banners to be fully functional
        int width = ViewGroup.LayoutParams.MATCH_PARENT;
    
        // Banner height on phones and tablets is 50 and 90, respectively
        int heightPx = getResources().getDimensionPixelSize( R.dimen.banner_height );
    
        adView.setLayoutParams( new FrameLayout.LayoutParams( width, heightPx ) );
    
        // Set background or background color for banners to be fully functional
        adView.setBackgroundColor( R.color.background_color );
    
        ViewGroup rootView = findViewById( android.R.id.content );
        rootView.addView( adView );
    
        // Load the ad
        adView.loadAd();
    }
//hide banner ad
   public void hideBannerAd(){
        adView.setVisibility( View.GONE );
adView.stopAutoRefresh();
    }

    //show banner ad

    public void showBannerAd(){
        adView.setVisibility( View.VISIBLE );
adView.startAutoRefresh();
    }

    // MAX Ad Listener
    @Override
    public void onAdLoaded(final MaxAd maxAd) {}

    @Override
    public void onAdLoadFailed(final String adUnitId, final int errorCode) {}

    @Override
    public void onAdDisplayFailed(final MaxAd maxAd, final int errorCode) {}

    @Override
    public void onAdClicked(final MaxAd maxAd) {}

    @Override
    public void onAdExpanded(final MaxAd maxAd) {}

    @Override
    public void onAdCollapsed(final MaxAd maxAd) {}

    @Override
    public void onAdDisplayed(final MaxAd maxAd) { /* DO NOT USE - THIS IS RESERVED FOR FULLSCREEN ADS ONLY AND WILL BE REMOVED IN A FUTURE SDK RELEASE */ }

    @Override
    public void onAdHidden(final MaxAd maxAd) { /* DO NOT USE - THIS IS RESERVED FOR FULLSCREEN ADS ONLY AND WILL BE REMOVED IN A FUTURE SDK RELEASE */ }
}