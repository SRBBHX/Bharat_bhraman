const form = document.querySelector("form");

form.addEventListener("submit", event => {
  event.preventDefault();

  const videoUrl = form.elements["video-url"].value;

  // Your implementation for downloading the YouTube video goes here.

  console.log(`Downloading YouTube video: ${videoUrl}`);
});
